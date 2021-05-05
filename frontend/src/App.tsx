import Navbar from 'components/nav_bar';
import Footer from 'components/footer';
import Table from 'components/tables';
function App() {
  return (
    <>
      <Navbar />
      <div className="container my-md-2">
        <h2 className="text-primary">Finanças Acme</h2>
        <Table/>
      </div>
      <Footer/>
    </>
  );
}

export default App;
