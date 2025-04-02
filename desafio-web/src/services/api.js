import axios from "axios";

const api = axios.create({
  baseURL: window.location.hostname === 'localhost' 
    ? 'http://localhost:9999' 
    : '/api',
  timeout: 5000
});

export default api;
