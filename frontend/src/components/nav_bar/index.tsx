import React from 'react';
import Financeiro from 'assets/img/mercado-financeiro.png';

function Navbar() {
  return (
    <div className="container">
      <nav className="my-4 my-md-2 mr-md-3">
        <img src={Financeiro} alt="DevSuperior" width="120" />
      </nav>
    </div>
  );
}
export default Navbar;

