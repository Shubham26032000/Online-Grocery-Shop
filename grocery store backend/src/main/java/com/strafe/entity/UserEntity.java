package com.strafe.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "user")
public class UserEntity {
    /***

     <>
     <nav className='navbar navbar-expand-lg bg-light'>
     <div className="container-fluid">
     <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
     <span className="navbar-toggler-icon">Strafe</span>
     </button>
     <div className="collapse navbar-collapse" id="navbarNav">
     <ul className="navbar-nav">
     <li className="nav-item">
     <a className="nav-link active" onClick={()=>navigate('/homePage')} aria-current="page" >Home</a>
     </li>
     <li className="nav-item">
     <a className="nav-link"  onClick={()=>navigate('/cart')} >Cart</a>
     </li>
     <li className="nav-item">
     <a className="nav-link" onClick={()=> navigate('/order')} >My Orders</a>
     </li>
     <li className="nav-item">
     <a className="nav-link" onClick={logout}>Log out</a>
     </li>
     </ul>
     </div>
     </div>
     </nav>
     </>
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String userName;

    @Column(unique = true)
    private String email;

    private String mobileNumber;
    private String password;
    private boolean isAdmin ;

    public UserEntity() {
        this.isAdmin = false;
    }

    public UserEntity(long id, String userName, String email, String mobileNumber, String password, boolean isAdmin) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.password = password;
        this.isAdmin = isAdmin;
    }
}
