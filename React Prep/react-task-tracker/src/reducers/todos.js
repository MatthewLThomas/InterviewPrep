const todoReducer = (state = [{todoName:"test"}], action) => {
    switch(action.type){
        case "ADD_TODO": 
            action.payload.index = state.length;
            action.index = state.length;
            state.push(action.payload);
            const newstate = state;
            return newstate;

        case "REMOVE_TODO":    
            state.splice(action.payload, 1);
            return state;

        case "EDIT_TODO":  
            state.splice(action.payload.index, 1, action.payload);
            return state;
        default: return state;
    }

}
export default todoReducer;