import axios from "axios";

export default axios.create({
  baseURL: "http://localhost:8080/api/v1/movies",
  headers: {
    "Content-Type": "application/json",
    Authorization: "changemeinprod!",
  },
});
