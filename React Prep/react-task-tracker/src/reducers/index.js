import todoReducer from './todos'
import { combineReducers}from 'redux'

export const allReducers = combineReducers({
    todos: todoReducer,
})