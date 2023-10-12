export type IBookModel = {
  totalItems: number;
  items: VolumeInfo[];
};

export type VolumeInfo = {
  title: string;
  subtitle: string;
  authors: string[];
  publisher: string;
  publishedDate: string;
  description: string;
  industryIdentifiers: IndustryIdentifiers[];
  pageCount: number;
  categories: string[];
  language: string;
  imageLinks: ImageLinks;
};

export type ImageLinks = {
  smallThumbnail: string;
  thumbnail: string;
};
export type IndustryIdentifiers = {
  type: string;
  identifier: string;
};
