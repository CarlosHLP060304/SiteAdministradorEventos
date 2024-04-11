export function Header (props){
    return (
    `<header class="d-flex bg-success p-2">
    <h1>Página de Admin</h1>
      <nav class=" d-flex align-items-center  justify-content-end ">
        <ul class="d-flex align-items-center ">
            <li><a href=${props.link_home}>Home</a></li>
            <li><a href=${props.link_novo_evento}>Adicionar novo Evento</a></li>
            <li><a href=${props.link_listar_eventos}>Listar todos os Eventos</a></li>
            <li><a href=${props.link_nova_cidade}>Adicionar nova as Cidade</a></li>
            <li><a href=${props.link_listar_cidades}>Listar todas as Cidades</a></li>
        </ul>
      </nav>
</header>`)

}