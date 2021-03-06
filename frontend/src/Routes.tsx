import Dashboard from "pages/dashboard";
import Home from "pages/home"
import React from "react";
import { BrowserRouter, Route, Switch } from "react-router-dom"

const Routes = () => {
  return (
    <BrowserRouter>
      <Switch>
        <Route path="/" exact >
          <Home/>
        </Route>
        <Route path="/dashboard" >
          <Dashboard/>
        </Route>
      </Switch>
    </BrowserRouter>
  );
}

export default Routes;