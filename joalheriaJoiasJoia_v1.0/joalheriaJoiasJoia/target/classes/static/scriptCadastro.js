document.addEventListener("DOMContentLoaded", () =>{
	
	const form = document.getElementById("cadastroClienteForm");
	
	form.addEventListener("submit", async (event) => {
		event.preventDefault();
		
		const nomeCliente = document.getElementById("nome").value;
		const cpf = document.getElementById("cpf").value;
		const email = document.getElementById("email").value;
		const telefone = document.getElementById("telefone").value;
		const dt_nascimento = document.getElementById("dt_nascimento").value;
		
		try{
			
			const response = await fetch ("http://localhost:8080/cadastrocliente", {
				method: "POST",
				headers: {
					"Content-Type": "application/json"
				},
				body: JSON.stringify({
					nomeCliente,
					cpf,
					email,
					telefone,
					dt_nascimento	
				}), 
			});
			
			if (response.ok){
				alert("Cliente Cadastrado Com Sucesso!");
			} else {
				alert("Erro ao cadastrar o cliente :(");
			}
		} catch (error) {
			console.error("Erro ao Cadastrar o cliente:", error);
		}
		
	});
});