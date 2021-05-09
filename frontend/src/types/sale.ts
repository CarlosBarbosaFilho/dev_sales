import { Seller } from 'types/Seller'

export type SaleAmount = {
  seller : string,
  amount : number
}

export type SalesEfetive = {
  seller: string,
  visited: number,
  deals: number
}

export type Sales = {
  id: number,
  visited: number,
  deals: number,
  amount: number,
  date: string,
  seller: Seller
}

export type SalePage = {
  content?: Sales[],
  last: boolean,
  totalPages: number,
  totalElements: number,
  size?: number,
  number: number,
  numberOfElements?: number,
  first: boolean,
  empty?: boolean
}
