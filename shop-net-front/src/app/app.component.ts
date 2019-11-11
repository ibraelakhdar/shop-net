import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  title:string = 'shop-net-front';

  constructor(private http: HttpClient) {
  }

  ngOnInit() {
    this.showHello();
  }

  showHello():void {
      this.http.get("http://localhost:8080/hello",{headers:{"Content-Type":"application/json"}}).subscribe(
        (response)=>{
          this.title = response['message'];
        },
        (error)=>{
          console.error(error);
        },
        ()=>{
        }
      )
  }
}
