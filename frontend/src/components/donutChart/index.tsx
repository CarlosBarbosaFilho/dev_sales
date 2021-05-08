import Chart from 'react-apexcharts';
import axios from 'axios';
import { BASE_URL } from 'utils/requests';
import { SaleAmount } from 'types/sale';

type ChartData = {
  series: number[];
  labels: string[];
}

const donutChart = () => {

  let chartData: ChartData = {labels:[], series:[]};

  axios.get(`${BASE_URL}/v1/sales/amountBySeller`)
    .then(res=>{
      const data = res.data as SaleAmount[]
      const myLabels = data.map(l => l.seller)
      const mySeries = data.map(s => s.amount)
      chartData = {series: mySeries, labels: myLabels}

      console.log(chartData)
    })

  //const mockData = {
    //series: [477138, 499928, 444867, 220426, 473088],
    //labels: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
  //}

  const options = {
    legend: {
      show: true
    }
  }
  return (
    <Chart
      options={{ ...options, labels: chartData.labels }}
      series={chartData.series}
      type="donut"
      height="240"
    />
  );
}

export default donutChart