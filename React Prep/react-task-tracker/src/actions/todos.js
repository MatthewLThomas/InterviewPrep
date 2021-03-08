export const addTodo = (payload) => {
    return{
        type: "ADD_TODO",
        payload: payload
    }
}

export const removeTodo = (payload) => {
    return{
        type: "REMOVE_TODO",
        payload: payload
    }
}

export const editTodo = (payload) => {
    return{
        type: "EDIT_TODO",
        payload: payload
    }
}