import axios from "axios";
import { useEffect, useState } from "react";
import { BASE_URL } from "utils/requests";
import {SalePage} from 'types/sale';
import { formatLocalDate } from "utils/formatLocalDate";

const Table = () => {

  const [page, setPage] = useState<SalePage>({
    first: true,
    last: true,
    number: 0,
    totalElements: 0,
    totalPages: 0
  });
 
  useEffect(()=>{
    axios.get(`${BASE_URL}/v1/sales?page=0&size=10&short=data,desc`)
      .then(response => {
        setPage(response.data)
      })
  },[])

  return (
    <div className="table-responsive">
      <table className="table table-striped table-sm">
        <thead>
          <tr>
            <th>Data</th>
            <th>Vendedor</th>
            <th>Clientes visitados</th>
            <th>Negócios fechados</th>
            <th>Valor</th>
          </tr>
        </thead>
        <tbody>
          { page.content?.map(s => (
            <tr key={s.id}>
              <td>{formatLocalDate(s.date, "dd/MM/yyyy")}</td>
              <td>{s.seller.name}</td>
              <td>{s.visited}</td>
              <td>{s.deals}</td>
              <td>{s.amount.toFixed(2)}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default Table