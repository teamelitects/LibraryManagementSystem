import React, { Component } from 'react'
import UserService from '../services/UserService';

class RegisterUserComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
            userName:'',
		    password: '',
		    email:'',
		    firstName: '',
		    lastName:'',
		    address:'',
		    phoneNumber:'',
		    city:''
        }
        this.changeuserNameHandler = this.changeuserNameHandler.bind(this);
        this.changepasswordHandler = this.changepasswordHandler.bind(this);
        this.changeemailHandler = this.changeemailHandler.bind(this);
        this.changefirstNameHandler = this.changefirstNameHandler.bind(this);
        this.changelastNameHandler = this.changelastNameHandler.bind(this);
        this.changeaddressHandler = this.changeaddressHandler.bind(this)
        this.changephoneNumberHandler = this.changephoneNumberHandler.bind(this)
        this.changecityHandler = this.changecityHandler.bind(this)
        this.saveOrUpdateEmployee = this.saveOrUpdateEmployee.bind(this);
    }

    // step 3
    componentDidMount(){

        // step 4
        if(this.state.id === ' '){
            return
        }    
    }
    saveOrUpdateEmployee = (e) => {
        e.preventDefault();
        let user = {userName: this.state.userName, password: this.state.password, email: this.state.email, firstName: this.state.firstName, lastName: this.state.lastName, address: this.state.address, phoneNumber: this.state.phoneNumber, city: this.state.city}
        console.log('user => ' + JSON.stringify(user));
            UserService.RegisterUser(user).then(res =>{
                window.location.replace('http://localhost:8080/login');
            });
        
    }
    
        // step 5

 
    
    changeuserNameHandler= (event) => {
        this.setState({userName: event.target.value});
    }

    changepasswordHandler= (event) => {
        this.setState({password: event.target.value});
    }
    changeemailHandler = (event) => {
        this.setState({email: event.target.value});
    }
    changefirstNameHandler = (event) => {
        this.setState({firstName: event.target.value});
    }
    changelastNameHandler = (event) => {
        this.setState({lastName: event.target.value});
    }
    changeaddressHandler = (event) => {
        this.setState({address: event.target.value});
    }
    changephoneNumberHandler = (event) => {
        this.setState({phoneNumber: event.target.value});
    }
    changecityHandler = (event) => {
        this.setState({city: event.target.value});
    }

    cancel(){
        this.props.history.push('/');
    }

    getTitle(){
        if(this.state.id === '_add'){
            return <h3 className="text-center">LOGIN</h3>
        }else{
            return <h3 className="text-center">REGISTRATION</h3>
        }
    }
    render() {
        return (
            <div>
                <br></br>
                   <div className = "container">
                        <div className = "row">
                            <div className = "card col-md-6 offset-md-3 offset-md-3">
                                {
                                    this.getTitle()
                                }
                                <div className = "card-body">
                                    <form>
                                        <div className = "form-group">
                                            <label> User Name: </label>
                                            <input placeholder="User Name" name="userName" className="form-control" 
                                                value={this.state.userName} onChange={this.changeuserNameHandler}/>
                                        </div>
                                        <div className = "form-group">
                                            <label> Password: </label>
                                            <input placeholder="Password" type="password" name="password" className="form-control" 
                                                value={this.state.password} onChange={this.changepasswordHandler}/>
                                        </div>
                                    
                                        <div className = "form-group">
                                            <label> Email Id: </label>
                                            <input placeholder="Email Address" name="email" className="form-control" 
                                                value={this.state.email} onChange={this.changeemailHandler}/>
                                        </div>

                                        <div className = "form-group">
                                            <label> firstName: </label>
                                            <input placeholder="firstName" type="firstName" name="firstName" className="form-control" 
                                                value={this.state.firstName} onChange={this.changefirstNameHandler}/>
                                        </div>
                                        <div className = "form-group">
                                            <label> lastName: </label>
                                            <input placeholder="lastName" type="lastName" name="lastName" className="form-control" 
                                                value={this.state.lastName} onChange={this.changelastNameHandler}/>
                                        </div>
                                        <div className = "form-group">
                                            <label> address: </label>
                                            <input placeholder="address" type="address" name="address" className="form-control" 
                                                value={this.state.address} onChange={this.changeaddressHandler}/>
                                        </div>
                                        <div className = "form-group">
                                            <label> phoneNumber: </label>
                                            <input placeholder="phoneNumber" type="phoneNumber" name="phoneNumber" className="form-control" 
                                                value={this.state.phoneNumber} onChange={this.changephoneNumberHandler}/>
                                        </div>
                                        <div className = "form-group">
                                            <label> city: </label>
                                            <input placeholder="city" type="city" name="city" className="form-control" 
                                                value={this.state.city} onChange={this.changecityHandler}/>
                                        </div>

                                        

                                    
                                        
                                        <br></br>
                                        <button className="btn btn-success" onClick={this.saveOrUpdateEmployee}>Sign Up</button>
                                        <button className="btn btn-danger" onClick={this.cancel.bind(this)} style={{marginLeft: "10px"}}>Cancel</button>
                                    </form>
                                </div>
                            </div>
                        </div>

                   </div>
            </div>
        )
    }
}

export default RegisterUserComponent
