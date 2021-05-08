import React from "react";
import Navbar from 'components/nav_bar'
import Footer from 'components/footer'
import { Link } from "react-router-dom";
const Home = () => {
  return (
    <>
      <Navbar/>
      <div className="container">
        <div className="jumbotron">
          <h1 className="display-4">Vendas Acme</h1>
          <p className="lead">Analise o desempenho das suas vendas por diferentes perspectivas</p>
        </div>
        <Link className="btn btn-primary btn-lg" to="/dashboard">
          Dashboard
        </Link>
      </div>
      <Footer/>
    </>
  );
}

export default Home;