import axios from 'axios';


class LoginValidate {


    VerifyEmployee(employee) {
        if(employee==="sukesh"){
            axios.get('http://localhost:8080/employee');
        }
        else if(employee==='krishna'){
            axios.get("http://localhost:8080/user");
        }
        else if(employee==='naveen'){
            axios.get("http://localhost:8080/user");
        }
        else if(employee==='kajal'){
            axios.get("http://localhost:8080/user");
        }
        else if(employee==='kasturi'){
            axios.get("http://localhost:8080/user");
        }
        else if(employee==='sandeep'){
            axios.get("http://localhost:8080/user");
        }
        else if(employee==='sushmitha'){
            axios.get("http://localhost:8080/user");
        }
        

    }

}

export default new LoginValidate()