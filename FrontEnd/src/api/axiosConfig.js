import axios from 'axios';

export default axios.create({
    baseURL:'https://7af3-153-33-76-24.ngrok-free.app',
    headers: {"ngrok-skip-browser-warning": "true"}
});
