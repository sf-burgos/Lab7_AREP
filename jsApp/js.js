js = (() => {
    const ftoc = (f) => {
        fetch('https://lxgus83vdh.execute-api.us-east-1.amazonaws.com/converter?value='+f)
        .then(res => res.json())
        .catch( () => console.error("error"))
        .then(res => {
           document.getElementById("c").value=res;
        }) 
    }
    return{
        ftoc: ftoc
    }
})();