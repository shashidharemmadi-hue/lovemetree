const submit = async () => {

  const res = await fetch("https://lovemetree-1.onrender.com/api/calculate",{
      method:"POST",
      headers:{
        "Content-Type":"application/json"
      },
      body:JSON.stringify({
          yourName:name,
          partnerName:partner
      })
  });

  const data = await res.json();
  alert(data.message);
};