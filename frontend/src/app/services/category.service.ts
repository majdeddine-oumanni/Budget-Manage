import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Category } from '../models/category';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {

  constructor(private http : HttpClient) { }

  private apiUrl = 'http://localhost:8080/categories';

  getAll():Observable<Category[]>{
    return this.http.get<Category[]>(this.apiUrl);
  }
  getById(id:number):Observable<Category>{
    return this.http.get<Category>(`${this.apiUrl}/${id}`);
  }

  add(categorie:Category):Observable<Category>{
    return this.http.post<Category>(this.apiUrl, categorie);
  }

  update(id:number, categorie:Category):Observable<Category>{
    return this.http.put<Category>(`${this.apiUrl}/${id}`, categorie);
  }

  delete(id:number):Observable<void>{
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}
