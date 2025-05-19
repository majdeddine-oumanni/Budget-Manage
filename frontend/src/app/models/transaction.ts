import { Category } from "./category"

export interface Transaction{
    id ?: number,
    amount : number,
    date : string,
    description : string
    category : Category
}