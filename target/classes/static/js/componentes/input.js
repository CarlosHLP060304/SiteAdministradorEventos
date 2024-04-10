export function Input(props) {
    return(
        `
        <div class="p-2">
            <label for= ${props.id} >${props.label}</label>
            <input type="text" th:field="*{${props.text}}" name=${props.name} id=${props.id} />
        </div>
        `
    )
}