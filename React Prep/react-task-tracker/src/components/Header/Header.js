import React from 'react'
import Tippy from '@tippyjs/react'


const Header = () => {

    return (
        <div>
            <header className = "border">
                <Tippy content="Goodbye">
                     <button>My button is awesome</button>
                </Tippy>
            </header>
        </div>
    )
}

export default Header
