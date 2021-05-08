import Chart from 'react-apexcharts';
import axios from 'axios';
import { BASE_URL } from 'utils/requests';
import { SaleAmount } from 'types/sale';
import { useState, useEffect } from 'react';

type ChartData = {
  series: number[];
  labels: string[];
}

const DonutChart = () => {

  const [chartData, setChartData] =
    useState<ChartData>({ labels: [], series: [] });
  useEffect(() => {
    axios.get(`${BASE_URL}/v1/sales/amountBySeller`)
      .then(res => {
        const data = res.data as SaleAmount[]
        const myLabels = data.map(l => l.seller)
        const mySeries = data.map(s => s.amount)
        setChartData({ series: mySeries, labels: myLabels });
      });
  }, []);


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

export default DonutChart