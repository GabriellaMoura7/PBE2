document.addEventListener("DOMContentLoaded", () => {
    const form = document.getElementById("cadastroEnderecoForm");

    form.addEventListener("submit", async (event) => {
        event.preventDefault();

        const cep = document.getElementById("cep").value;
        const estado = document.getElementById("estado").value;
        const cidade = document.getElementById("cidade").value;
        const numero = document.getElementById("numero").value;
        const rua = document.getElementById("rua").value;
		const complemento = document.getElementById("complemento").value;
		const bairro = document.getElementById("bairro").value;

        try {
            const response = await fetch("http://localhost::8080/cadastroendereco", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify({
                    cep,
                    estado,
                    cidade,
                    numero,
                    rua,
					complemento, 
					bairro
                }),
            });

            if (response.ok) {
                alert("Endereço Cadastrado com Sucesso!");
            } else {
                alert("Falha ao Cadastrar o Endereço :(");
            }
        } catch (error) {
            console.error("Erro ao Cadastrar o Endereço: ", error);
        }
    });
});