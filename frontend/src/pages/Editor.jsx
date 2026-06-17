import { useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import { getDocument, updateDocument } from "../services/documentService";
import RichTextEditor from "../components/RichTextEditor";

function Editor() {
  const { id } = useParams();

  const [doc, setDoc] = useState({
    title: "",
    content: "",
  });

  useEffect(() => {
    loadDocument();
  }, []);

  const loadDocument = async () => {
    const response = await getDocument(id);
    setDoc(response.data);
  };

  const saveDocument = async () => {
    await updateDocument(id, doc);
    alert("Document Saved!");
  };

  return (
  <div style={{ padding: "20px" }}>
    <h2>Document Editor</h2>

    <input
      type="text"
      value={doc.title}
      onChange={(e) =>
        setDoc({
          ...doc,
          title: e.target.value,
        })
      }
    />

    <br />
    <br />

    <RichTextEditor
      content={doc.content}
      onChange={(html) =>
        setDoc({
          ...doc,
          content: html,
        })
      }
    />

    <br />
    <br />

    <button onClick={saveDocument}>
      Save Document
    </button>

    <br />
    <br />

    <input
      type="text"
      placeholder="Share with user"
    />

    <button>
      Share
    </button>
  </div>
);
}

export default Editor;