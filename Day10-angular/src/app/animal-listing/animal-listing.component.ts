import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-animal-listing',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './animal-listing.component.html',
  styleUrl: './animal-listing.component.css'
})
export class AnimalListingComponent implements OnInit {

  lst:Animal[]=[
      
      {
        name: "Reksis",
        age: 4,
        breed: "suns",
        picture: "https://th.bing.com/th/id/R.f80579dfb5ee49324d9e562bd97a5654?rik=Z31Ux83lsOYGZA&riu=http%3a%2f%2f1.bp.blogspot.com%2f-SQy-vn0U53U%2fUZV8FlLe0zI%2fAAAAAAAAE-M%2f-2_iLG54exA%2fs1600%2fGerman%2bShepherd.jpg&ehk=tiXFZqia1aB4JrSWr32BXFpwnHFfwRTG02ASozIx1h0%3d&risl=&pid=ImgRaw&r=0"
      },
      {
        name: "Pūka",
        age: 1,
        breed: "kaķis",
        picture: "https://upload.wikimedia.org/wikipedia/commons/a/a5/Red_Kitten_01.jpg"
      },
      {
        name: "Susurs",
        age: 2,
        breed: "suns",
        picture: "https://nosamisleschiens.fr/wp-content/uploads/2016/08/Jack-Russell-scaled-scaled.jpeg"
      }
      
  ]

  constructor(){
    console.log();
  }

  ngOnInit(): void {
    console.log();
  }  
  
}

export interface Animal {
  name: string,
  age: number,
  breed : string,
  picture: string
}
