import React from 'react';
import { Link } from 'react-router-dom';

function Navbar() {
  return (
    <div className="container">
        <nav className="navbar navbar-expand-lg navbar-light bg-light">
          <div className="container-fluid">
            <Link to="/">
                Home
            </Link>
          </div>
        </nav>

    </div>
    
  );
}
export default Navbar;

