//import axions into project
import axions from 'axios';


// configure and export axios object that we use to make
// http request to relevant remote API

export default axios.create({
    baseURL: "https://9c96-103-106-239-104.ap.ngrok.io",
    headers: {"ngrok-skip-browser-warnings":"true"}
});
