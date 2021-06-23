import React, { Component } from 'react'
import LoginValidate from '../services/LoginValidate';


class LoginComponent extends Component 
{
    constructor(props) {
        super(props)

        this.state = {
            // step 2
            username: '',
            password: '',
        }
        this.changeUsernameHandler = this.changeUsernameHandler.bind(this);
        this.changePasswordHandler = this.changePasswordHandler.bind(this);
        this.checkEmployee = this.checkEmployee.bind(this);
    }

    // step 3
    /*componentDidMount() {

        let employee = res.data;
        this.setState({ username: employee.username, password: employee.password });
    }*/
    checkEmployee = (e) => {
        e.preventDefault();
        let employee = { username: this.state.username, password: this.state.password };
        console.log('employee => ' + JSON.stringify(employee));


       const result=LoginValidate.VerifyEmployee(employee);
       console.log(result);
        
        
    }

    changeUsernameHandler = (event) => {
        this.setState({ username: event.target.value });
    }

    changePasswordHandler = (event) => {
        this.setState({ password: event.target.value });
    }


render()
{
    return (
        <div>


            <br></br>
            <br></br>
            <br></br>
            

            <form>
                <div>
                    <label>UserName</label>
                    <input placeholder="Username" name="username" className="form-control"
                        value={this.state.username} onChange={this.changeUsernameHandler} />
                </div>
                <div>
                    <label>Password</label>
                    <input placeholder="Password" name="password" className="form-control"
                        value={this.state.password} onChange={this.changePasswordHandler} />
                </div>


                <button className="btn" onClick={this.checkEmployee}>Submit</button>

            </form>




        </div>


    )
}
}


export default LoginComponent
