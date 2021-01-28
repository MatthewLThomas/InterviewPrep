import {React, useState} from 'react'

import Tippy from '@tippyjs/react'


const Footer = () => {
    const [inputState, setinputState] = useState('')

    const [valueArray, setvalueArray] = useState([])

    const updateState = (event) => {
        setinputState(event.target.value)
    }

    
    const handleSubmit = (event) => {
        event.preventDefault();
        let interum = valueArray;
        interum.push(event.target[0].value);
        setvalueArray(interum);
        setinputState("")
        console.log(valueArray)
    }
    return (
        <div className ="border text-center">
            
            <br/>
            <br/><br/><br/>
            <form onSubmit = {(event) => {handleSubmit(event)}}> 
                <Tippy content = "Enter in whatever your heart desires">
                <input type = "text" value={inputState}onChange ={(event) => {updateState(event)}} placeholder = "input"/>
                </Tippy>
                <input type = "submit"></input>
            </form>
            <ul>
                <>{valueArray.map((value, index) => {
                    return <li key={index}>{value}</li>
                })}
                </>
            </ul>

            
        </div>
    )
}

export default Footer
