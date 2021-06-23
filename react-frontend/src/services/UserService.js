
import axios from 'axios';


class UserService {
    
    RegisterUser(user){
        console.log("g1"+user.userName);
        axios.defaults.headers.post['Access-Control-Allow-Origin'] = '*';
       return axios.get('http://localhost:8080/login');
    }

    
}

export default new UserService()