import Navbar from 'components/nav_bar';
import Footer from 'components/footer';
import Table from 'components/tables';
import BarChart from 'components/bar_chart';
import DonutChart from 'components/donutChart';

const Dashboard = () => {
  return (
    <>
      <div className="container my-md-2">
        <Navbar />
        <h2 className="text-primary">Vendas Acme</h2>
        <hr />
        <div className="row px-6">
          <div className="col-sm-6">
            <h2 className="text-center text-secondary">Meta do mês (%)</h2>
            <BarChart />
          </div>

          <div className="col-sm-6">
            <h2 className="text-center text-secondary">Todas as vendas realizadas</h2>
            <DonutChart />
          </div>
        </div>
        <div className="py-3">
          <h2 className="text-primary">Todas as vendas</h2>
        </div>
        <Table />
      </div>
      <Footer />
    </>
  );
}

export default Dashboard;