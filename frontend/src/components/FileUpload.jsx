import axios from "axios";

function FileUpload({ refresh }) {

  const handleUpload = async (e) => {

    const formData = new FormData();

    formData.append(
      "file",
      e.target.files[0]
    );

    await axios.post(
      "http://localhost:8080/api/upload",
      formData
    );

    refresh();
  };

  return (
    <input
      type="file"
      onChange={handleUpload}
    />
  );
}

export default FileUpload;