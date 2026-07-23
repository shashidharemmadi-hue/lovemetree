const submit = async () => {

  const res = await fetch("http://localhost:8080/api/calculate",{
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