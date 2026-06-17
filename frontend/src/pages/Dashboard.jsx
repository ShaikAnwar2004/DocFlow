import { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import FileUpload from "../components/FileUpload";

import {
  getDocuments,
  createDocument,
} from "../services/documentService";

function Dashboard() {
  const [documents, setDocuments] = useState([]);

  useEffect(() => {
    loadDocuments();
  }, []);

  const loadDocuments = async () => {
    const response = await getDocuments();
    setDocuments(response.data);
  };

  const handleCreate = async () => {
    await createDocument({
      title: "New Document",
      content: "",
      ownerId: 1,
    });

    loadDocuments();
  };

  return (
  <div style={{ padding: "20px" }}>
    <h1>📄 DocFlow</h1>

    <button onClick={handleCreate}>
      Create Document
    </button>

    <br />
    <br />

    <FileUpload refresh={loadDocuments} />

    <h3>My Documents</h3>

    <ul className="document-list">
      {documents.map((doc) => (
  <Link key={doc.id} to={`/editor/${doc.id}`}>
    {doc.title}
  </Link>
))}
    </ul>
  </div>
);
}

export default Dashboard;