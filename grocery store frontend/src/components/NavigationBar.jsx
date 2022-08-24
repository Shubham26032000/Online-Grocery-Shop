import React from 'react'
import '../index.css'
import {useNavigate} from 'react-router-dom'

const NavigationBar = () => {

  const navigate = useNavigate();
  const logout = ()=>{
    window.sessionStorage.clear();
    navigate('/signIn')

    

  }
  return (
    <nav>
    <a onClick={()=> navigate('/homePage')} className='logo'>Grocery Store</a>
    <div className='element'>
      <a id='productHomeButton' onClick={()=>navigate('/homePage')} className='element'>Home</a>
      <a id='productCartButton' onClick={()=>navigate('/cart')} className='element'>Cart</a>
      <a id='productOrderButton' onClick={()=> navigate('/order')} className='element'>My Order</a>
    </div>
    <a id='logout' onClick={logout} className='logout'>Log out</a>
  </nav>
  )
}

export default NavigationBar