const pessoasRadio = document.querySelector("#pessoas");
const contasRadio = document.querySelector("#contas");
const alocacoesRadio = document.querySelector("#alocacoes");
const formPessoas = document.querySelector(".form-pessoas");
const formAlocacoes = document.querySelector(".form-alocacoes");
const formContas = document.querySelector(".form-contas");

pessoasRadio.addEventListener('change', () => {
  formPessoas.classList.remove("hidden");
  formAlocacoes.classList.add("hidden");
  formContas.classList.add("hidden");
});

alocacoesRadio.addEventListener('change', () => {
  formPessoas.classList.add("hidden");
  formAlocacoes.classList.remove("hidden");
  formContas.classList.add("hidden");
})

contasRadio.addEventListener('change', () => {
  formPessoas.classList.add("hidden");
  formAlocacoes.classList.add("hidden");
  formContas.classList.remove("hidden");
})