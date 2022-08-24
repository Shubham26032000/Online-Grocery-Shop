import React from "react";
import {useNavigate} from 'react-router-dom'
const ProductCard = ({product}) => {

  const navigate = useNavigate();

  const productDetails = (e,id) =>{
    e.preventDefault();
    navigate(`/productDetails/${id}`)    
  }
  return (
    // <div className="productCard">
      <div className="card" onClick={(e)=>productDetails(e,product.id)}>
        <img className="product" src={product.imageUrl} alt="productImage" />
        <div className="productDes">
          <div>{product.name}</div>
          <div>{product.price}$</div>
        </div>
      </div>
    /* </div> */
  );
};

export default ProductCard;
