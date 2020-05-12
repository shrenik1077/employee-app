import { Component, OnInit } from '@angular/core';
import { Technology } from '../common/technology';
import { TechnologyService } from '../services/technology.service';

@Component({
  selector: 'app-technology',
  templateUrl: './technology.component.html',
  styleUrls: ['./technology.component.css']
})
export class TechnologyComponent implements OnInit {

  technologies: Technology[];

  constructor(private _technologyService: TechnologyService) {

  }

  ngOnInit() {
    this.listTechnologies();
    console.log(this.technologies);
  }

  listTechnologies(){
    this._technologyService.getTechnology().subscribe(
      data => {
        console.log(data);
        this.technologies = data;
      }
    );
  }

}
