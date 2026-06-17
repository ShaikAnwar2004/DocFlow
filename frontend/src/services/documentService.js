import axios from "axios";

const API_URL = "https://docflow-8wjc.onrender.com/api/documents";

export const getDocuments = () => axios.get(API_URL);

export const getDocument = (id) =>
  axios.get(`${API_URL}/${id}`);

export const createDocument = (document) =>
  axios.post(API_URL, document);

export const updateDocument = (id, document) =>
  axios.put(`${API_URL}/${id}`, document);