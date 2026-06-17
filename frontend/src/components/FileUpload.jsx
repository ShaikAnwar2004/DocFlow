import axios from "axios";

function FileUpload({ refresh }) {

  const handleUpload = async (e) => {

    const formData = new FormData();

    formData.append(
      "file",
      e.target.files[0]
    );

    await axios.post(
      "https://docflow-8wjc.onrender.com/api/upload",
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