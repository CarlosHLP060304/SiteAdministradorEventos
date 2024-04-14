const header =  document.querySelector("header")


header.innerHTML =
`
<h1>Página de Administrador</h1>
<nav class=" d-flex align-items-center  justify-content-end ">
  <ul class="d-flex align-items-center ">
      <li><a href="/">Home</a></li>
      <div class="dropdown me-1">
      <button type="button" class="btn btn-secondary dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false" data-bs-offset="10,20">
        Eventos
      </button>
      <ul class="dropdown-menu">
        <li><a class="dropdown-item" href="/evento/cadastrar">Adicionar novo Evento</a></li>
        <li><a class="dropdown-item" href="/evento/listar">Listar todos os Eventos</a></li>
      </ul>
    </div>
      <div class="dropdown me-1">
      <button type="button" class="btn btn-secondary dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false" data-bs-offset="10,20">
        Cidades
      </button>
      <ul class="dropdown-menu">
        <li><a class="dropdown-item" href="/cidade/cadastrar">Adicionar nova Cidade</a></li>
        <li><a class="dropdown-item" href="/cidade/listar">Listar todas as Cidades</a></li>
      </ul>
    </div>
  </ul>
</nav>`


header.classList.add("d-flex")
header.classList.add("bg-success")
header.classList.add("p-2")


